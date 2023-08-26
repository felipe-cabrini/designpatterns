package br.com.fiap.proxy;

public class FileProxy implements File {

  private RealFile realFile;

  private boolean isEditable;

  public FileProxy(String content, boolean isEditable) {
    this.realFile = new RealFile(content);
    this.isEditable = isEditable;
  }

  @Override
  public void display() {
    realFile.display();
  }

  @Override
  public void edit(String content) {
    if(isEditable) {
      realFile.edit(content);
    } else {
      System.out.println("Acesso negado. Arquivo somente leitura");
    }

  }
}
