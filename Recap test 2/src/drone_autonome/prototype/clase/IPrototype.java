package drone_autonome.prototype.clase;

public interface IPrototype {
    IPrototype clone(int viteza, float costDezvoltare) throws InterruptedException, CloneNotSupportedException;
}
