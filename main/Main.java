class Main {
    public static void main(String[] args) {
        System.out.println("Hello world Main!");

        ADataClass dataClass = new ADataClass("The name", "The description");
        System.out.println("Print the data class: " + dataClass.toString());
    }
}