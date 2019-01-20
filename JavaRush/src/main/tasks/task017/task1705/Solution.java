package main.tasks.task017.task1705;

public class Solution {
    public static void main(String[] args) {
        OurPresident expectedPresident = OurPresident.getOurPresident();
        OurPresident ourPresident = OurPresident.getOurPresident();
        System.out.println(expectedPresident == ourPresident);
    }

    private static class OurPresident {
        private static OurPresident president;

        static {
            synchronized (OurPresident.class) {
                president = new OurPresident();
            }
        }

        private OurPresident() {
        }

        public static OurPresident getOurPresident() {
            return president;
        }
    }
}
