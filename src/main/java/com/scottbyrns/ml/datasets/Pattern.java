package com.scottbyrns.ml.datasets;

import java.util.Vector;

/**
 * Pattern of data values used for training Feed Forward Neural Networks.
 *
 * @author Scott Byrns
 * Date: Nov 11, 2010
 * Time: 2:19:46 PM
 *
 * @version 1.0
 */
public interface Pattern {

    /**
     * Get the token used to split the input data set string.
     *
     * @return String being used as the split token.
     */
    public String getDeliniater();

    /**
     * Set the token used to split the input data set string.
     * 
     * @param deliniater String to be used as the split token.
     */
    public void setDeliniater(String deliniater);

    /**
     * Set the input vector.
     * 
     * @param input new input vector
     */
    public void setInput (Vector<Double> input);

    /**
     * Get the input vector.
     * 
     * @return current input vector
     */
    public Vector<Double> getInput ();

    /**
     * Get the output vector.
     * 
     * @return current output vector
     */
    public Vector<Double> getOutput ();

}
