package com.sayhiai.example.javaagent;

import java.lang.instrument.Instrumentation;

public class AgentApp {
    public static void premain(String agentOps, Instrumentation inst) {
        System.out.println("==============enter premain==============");
        System.out.println(agentOps);
        inst.addTransformer(new Agent());
    }

    public static void agentmain(String agentOps, Instrumentation inst) {
        System.out.println("==============enter agentmain==============");
    }
}
