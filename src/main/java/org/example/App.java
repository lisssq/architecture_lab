package org.example;

public class App {
    public static void main(String[] args) {
        Commands prog[] =
                {   //это массив
                        (new Commands(Tasks.init, 2, 20)),
                        (new Commands(Tasks.init, 3, 30)),
                        (new Commands(Tasks.ld, "r1", 3)),
                        (new Commands(Tasks.ld, "r2", 2)),
                        (new Commands(Tasks.mul)),
                        (new Commands(Tasks.st, "r4", 4)),
                        (new Commands(Tasks.ld, "r3", 4)),
                        (new Commands(Tasks.mv, "r1", "r2")),
                        (new Commands(Tasks.print))

//                (new Commands(Tasks.ld, "r1",2)),
//                (new Commands(Tasks.ld,"r2",0)),
//                (new Commands(Tasks.add)),
//                (new Commands(Tasks.print)),
//                (new Commands(Tasks.sub)),
//                (new Commands(Tasks.print)),
//                (new Commands(Tasks.mul)),
//                (new Commands(Tasks.print)),
//                (new Commands(Tasks.div)),
//                (new Commands(Tasks.print)),
                };

        ICpu cpu = BCpu.build();
        for (int i = 0; i < prog.length; i++)
        {
            cpu.execute(prog[i]);
        }
    }
}