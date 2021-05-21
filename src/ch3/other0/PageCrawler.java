package ch3.other0;

/**
 * @author Zeyuan Wang[wangzeyuan@nowcoder.com]
 * @date 2021/05/21
 */
public interface PageCrawler {
  WikiPage getInheritedPage(String suiteSetupName, WikiPage wikiPage);
  WikiPagePath getFullPath(WikiPage suiteSetup);
}
