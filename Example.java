package Package110Feb2025;

class Example {
    // Private variable, accessible only within the class Example
    private String privateVariable = "Private Variable";

    // Default (package-private) variable, accessible only within the same package
    String defaultVariable = "Default (Package-Private) Variable";

    // Protected variable, accessible within the same package and by subclasses
    protected String protectedVariable = "Protected Variable";
 // Public variable, accessible from anywhere
    public String publicVariable = "Public Variable";
 // Private method, accessible only within the class Example
    private void privateMethod() {
        System.out.println("Private Method");
    }
// Default (package-private) method, accessible only within the same package
    void defaultMethod() {
        System.out.println("Default (Package-Private) Method");
    }
// Protected method, accessible within the same package and by subclasses
    protected void protectedMethod() {
        System.out.println("Protected Method");
    }
 // Public method, accessible from anywhere
    public void publicMethod() {
        System.out.println("Public Method");
    }
}
