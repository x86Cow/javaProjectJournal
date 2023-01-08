/*
 * Title: Java Project Journal
 * Author: Alexander Lorei
 * Date Started: 1/7/23
 */

class Main{
    
    private static ProjectBook test = new ProjectBook();

    public static void main(String[] args) {
        System.out.println(test.getTitle());
        test.setTitle("First Project");
        System.out.println(test.getTitle());
    }
}
