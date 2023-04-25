package Part2;


    public class OuterClass
    {

        class InnerClass
        {
            void innerMethod()
            {
                System.out.println("inner method");
            }
        }

        void outerMethod()
        {
            System.out.println("outer method");

            class LocalClass
            {
                void localMethod()
                {
                    System.out.println("local method");
                }
            }

            LocalClass localInstance = new LocalClass();
            localInstance.localMethod();

            Runnable anonymousInstance = new Runnable()
            {
                public void run()
                {
                    System.out.println("anonymous method");
                }
            };

            anonymousInstance.run();
        }

        public static void main(String[] args)
        {
            OuterClass outerInstance = new OuterClass();
            outerInstance.outerMethod();
            InnerClass innerInstance = outerInstance.new InnerClass();
            innerInstance.innerMethod();
        }
    }

