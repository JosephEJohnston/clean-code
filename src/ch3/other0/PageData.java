package ch3.other0;

/**
 * @author Zeyuan Wang[wangzeyuan@nowcoder.com]
 * @date 2021/05/19
 */
public class PageData {
  private WikiPage wikiPage;

  public boolean hasAttribute(String attribute) {
    return true;
  }

  public WikiPage getWikiPage() {
    return wikiPage;
  }

  public void setWikiPage(WikiPage wikiPage) {
    this.wikiPage = wikiPage;
  }


  public String getContent() {
    return "-";
  }

  public void setContent(String toString) {
  }

  public String getHtml() {
    return "html";
  }
}
