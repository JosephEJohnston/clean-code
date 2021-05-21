package ch3.other0;

/**
 * @author Zeyuan Wang[wangzeyuan@nowcoder.com]
 * @date 2021/05/19
 */
public class PageCrawlerImpl {

  public static WikiPage getInheritedPage(String suiteSetupName, WikiPage wikiPage) {
    return suiteSetupName != null && wikiPage != null ? new WikiPage() : null;
  }

  public WikiPagePath getFullPath(WikiPage suiteSetup) {
    return new WikiPagePath();
  }
}
