package design.composite;
/**
 * @Auther: ltc
 * @Date: 2018/10/8 22:22
 * @Description: 组合模式（Composite）
 */

/**
 * 组合模式是为了表示那些层次结构，同时部分和整体也可能是一样的结构，常见的如文件夹或者树。举例：
 */
abstract class component {
}

class File extends component {
    String filename;
}

class Folder extends component {
    component[] files;  //既可以放文件File类，也可以放文件夹Folder类。Folder类下又有子文件或子文件夹。
    String foldername;

    public Folder(component[] source) {
        files = source;
    }

    public void scan() {
        for (component f : files) {
            if (f instanceof File) {
                System.out.println("File " + ((File) f).filename);
            } else if (f instanceof Folder) {
                Folder e = (Folder) f;
                System.out.println("Folder " + e.foldername);
                e.scan();
            }
        }
    }

}
