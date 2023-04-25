package Part2;

public class Main
{
    public class OuterClass
    {

        // Inner class (non-static nested class)
        class InnerClass
        {
            void innerClassMethod()
            {
                System.out.println("This is an inner class method.");
            }
        }

        void outerClassMethod()
        {
            System.out.println("This is an outer class method.");

            // Local class (class defined inside a method)
            class LocalClass
            {
                void localClassMethod()
                {
                    System.out.println("This is a local class method.");
                }
            }

            LocalClass localClassInstance = new LocalClass();
            localClassInstance.localClassMethod();

            // Anonymous class (subclass without a name)
            Runnable anonymousClassInstance = new Runnable() {
                @Override
                public void run() {
                    System.out.println("This is an anonymous class method.");
                }
            };

            anonymousClassInstance.run();
        }

        public static void main(String[] args) {
            OuterClass outerClassInstance = new OuterClass();
            outerClassInstance.outerClassMethod();

            // Using inner class
            InnerClass innerClassInstance = outerClassInstance.new InnerClass();
            innerClassInstance.innerClassMethod();
        }
    }

}
