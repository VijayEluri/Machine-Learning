package com.scottbyrns.ml.neural;

import java.util.Iterator;
import java.util.List;

/**
 * Weight Matrix.
 * 
 * @author Scott Byrns
 * Date: Nov 11, 2010
 * Time: 5:41:34 PM
 *
 * @version 1.0
 */
public interface SynapseLayer {

    /**
     * Add a synapse to the layer.
     *
     * @param synapse to add
     */
    public void addSynapse(Synapse synapse);

    /**
     * Get an iterator for the synapse vector.
     *
     * @return iterator
     */
    public Iterator<Synapse> getSynapsesIterator ();

    /**
     * Get a weight vector representing the weights of the synapses in this layer.
     *
     * @return Vector of weight values, null in case of error.
     */
    public List<Double> getWeightVector();

    /**
     * Set the weights of the synapses in this layer to the next values
     * of the provided weightVectorIterator
     *
     * @param weightVectorIterator to iterate over for new weight values.
     */
    public void setWeightVector (Iterator<Double> weightVectorIterator);

}
