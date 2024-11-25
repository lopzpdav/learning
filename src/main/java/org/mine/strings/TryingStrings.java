package org.mine.strings;

public class TryingStrings {
    /**
     * String:
     *  -Inmutable
     *  -Each modification creates a new instance
     *  -Perfect to use when the value we assign will never change
     */

    public void tryingString(){
        String sampleText = "sample";  //there is an instance of String
        System.out.println(sampleText);

        sampleText = sampleText.concat("2"); //there isn't the same instance, is a new one
        System.out.println(sampleText);
    }

    /**
     * StringBuffer:
     *  -Mutable
     *  -Each modification doesn't create a new instance
     *  -Perfect to use when the value is constantly changing
     *  -Better for multi-thread environment
     */

    public void tryingStringBuffer(){
        StringBuffer sampleText = new StringBuffer("sample");  //there is an instance of StringBuffer
        System.out.println(sampleText);

        sampleText.append("2"); //it's the same instance
        System.out.println(sampleText);
    }

    /**
     * StringBuilder:
     *  -Mutable
     *  -Each modification doesn't create a new instance
     *  -Perfect to use when the value is constantly changing
     *  -Better for one-thread environment
     */

    public void tryingStringBuilder(){
        StringBuilder sampleText = new StringBuilder("sample");  //there is an instance of StringBuilder
        System.out.println(sampleText);

        sampleText.append("2"); //it's the same instance
        System.out.println(sampleText);
    }
}
