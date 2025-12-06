package generics;

public class GenericPrinter<T extends Material> { // extends Material를 통해 자료형에 제한을 둠
    private T material;

    public void setMaterial(T material){
        this.material = material;
    }

    public T getMaterial(){
        return material;
    }

    public String toString(){
        return material.toString();
    }

    public void printing(){
        material.doPrinting();
    }
}
