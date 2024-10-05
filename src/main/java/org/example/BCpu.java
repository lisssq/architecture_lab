package org.example;

public class BCpu
{
    public static ICpu build()
    {
        return new CPU();
    }
}
