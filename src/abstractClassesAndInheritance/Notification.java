package abstractClassesAndInheritance;
abstract class Notification {
    abstract public boolean didOptIn();
    abstract public String unsubscribeLink();
    abstract public String getPhysicalAddress();
    abstract public String  getSenderInfo();
}
