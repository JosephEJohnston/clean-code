package ch3;

import ch3.other0.PageCrawlerImpl;
import ch3.other0.PageData;
import ch3.other0.PathParser;
import ch3.other0.SuiteResponder;
import ch3.other0.WikiPage;
import ch3.other0.WikiPagePath;

/**
 * @author Zeyuan Wang[wangzeyuan@nowcoder.com]
 * @date 2021/05/19
 */
public class Main0 {

  public static String testableHtml(
      PageData pageData,
      boolean includeSuiteSetup
  ) throws Exception {
    WikiPage wikiPage = pageData.getWikiPage();
    StringBuilder builder = new StringBuilder();
    if (pageData.hasAttribute("Test")) {
      if (includeSuiteSetup) {
        WikiPage suiteSetup =
            PageCrawlerImpl.getInheritedPage(
                SuiteResponder.SUITE_SETUP_NAME, wikiPage
            );
        if (suiteSetup != null) {
          WikiPagePath pagePath =
              suiteSetup.getPageCrawler().getFullPath(suiteSetup);
          String pagePathName = PathParser.render(pagePath);
          builder.append("!include -setup .")
              .append(pagePathName)
              .append("\n");
        }
      }
      WikiPage setup =
          PageCrawlerImpl.getInheritedPage("SetUp", wikiPage);
      if (setup != null) {
        WikiPagePath setupPath =
            wikiPage.getPageCrawler().getFullPath(setup);
        String setupPathName = PathParser.render(setupPath);
        builder.append("!include -setup .")
            .append(setupPathName)
            .append("\n");
      }
    }
    builder.append(pageData.getContent());
    if (pageData.hasAttribute("Test")) {
      WikiPage teardown =
          PageCrawlerImpl.getInheritedPage("TearDown", wikiPage);
      if (teardown != null) {
        WikiPagePath tearDownPath =
            wikiPage.getPageCrawler().getFullPath(teardown);
        String tearDownPathName = PathParser.render(tearDownPath);
        builder.append("\n")
            .append("!include -teardown .")
            .append(tearDownPathName)
            .append("\n");
      }
      if (includeSuiteSetup) {
        WikiPage suiteTeardown =
            PageCrawlerImpl.getInheritedPage(
                SuiteResponder.SUITE_TEARDOWN_NAME,
                wikiPage
            );
        if (suiteTeardown != null) {
          WikiPagePath pagePath =
              suiteTeardown.getPageCrawler().getFullPath(suiteTeardown);
          String pagePathName = PathParser.render(pagePath);
          builder.append("!include -teardown .")
              .append(pagePathName)
              .append("\n");
        }
      }
    }
    pageData.setContent(builder.toString());
    return pageData.getHtml();
  }

  // 重构后
  public static String renderPageWithSetupsAndTeardowns (
      PageData pageData, boolean isSuite
  ) throws Exception {
    boolean isTestPage = pageData.hasAttribute("test");
    if (isTestPage) {
      WikiPage testPage = pageData.getWikiPage();
      StringBuffer newPageContent = new StringBuffer();
      includeSetupPages(testPage, newPageContent, isSuite);
      newPageContent.append(pageData.getContent());
      pageData.setContent(newPageContent.toString());
    }
    return pageData.getHtml();
  }

  private static void includeSetupPages(WikiPage testPage, StringBuffer newPageContent, boolean isSuite) {
  }
}
