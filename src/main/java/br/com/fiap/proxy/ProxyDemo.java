package br.com.fiap.proxy;

public class ProxyDemo {

  public static void main(String[] args) {
    File readOnlyFile = new FileProxy("Hello, proxy!",false);
    File editableFile = new FileProxy("Hello Proxy, you can edit me!", true);

    //tentando editar arquivo read only
    readOnlyFile.edit("changed content");
    readOnlyFile.display();

    //tentando editar arquivo editavel
    editableFile.display();
    editableFile.edit("new content for editable file");
    editableFile.display();
  }
}
