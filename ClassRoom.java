class ClassRoom{
       public static void main(String[] arg){
        System.out.println(new Wilder("Anne-So", true).whoAmI());
        System.out.println(new Wilder("Domie", true).whoAmI());
        System.out.println(new Wilder("Martin", false).whoAmI());
        System.out.println(new Wilder("Franck", false).whoAmI());
        System.out.println(new Wilder("Bérénice", false).whoAmI());
        System.out.println(new Wilder("Jacky", false).whoAmI());
        System.out.println(new Wilder("Françoise", false).whoAmI());
        System.out.println(new Wilder("Amélie", false).whoAmI());
        System.out.println(new Wilder("Tim", false).whoAmI());
    }
}