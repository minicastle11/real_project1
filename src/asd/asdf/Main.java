package asd.asdf;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        hello d = new hello("22000521","SungminLee");
        System.out.println(d.toString());
    }

    public static class hello {
        private  String id;

        @Override
        public String toString() {
            return "asd.asdf.Main.hello{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    '}';
        }

        private  String name;

        public hello(String ID, String Name){
            id = ID;
            name = Name;
        }
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


    }
}