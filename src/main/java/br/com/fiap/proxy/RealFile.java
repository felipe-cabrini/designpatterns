package br.com.fiap.proxy;

public class RealFile implements File {

  private String content;

  public RealFile(String content) {
    this.content = content;
  }

  @Override
  public void display() {
    System.out.println(content);
  }

  @Override
  public void edit(String content) {
    this.content = content;
  }
}
