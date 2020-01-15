
class CmdLineArgs{
    public static void main(String[] args){
        System.out.println("Command Line Arguments received:");

        for (String arg: args){
            System.out.print(arg + " ");
        }

        System.out.println("\nTaking 1st three as input integers");

        try{
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = Integer.parseInt(args[2]);

            System.out.println("Max value: " + Math.max(a, Math.max(b, c)));
        }catch(Exception e){
            System.out.println("Please enter integers only");
        }

    }
}
            
