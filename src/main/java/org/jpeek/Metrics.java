/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2017-2024 Yegor Bugayenko
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package org.jpeek;

/**
 * Metrics

 * <p>Enumeration representing various metrics along with their configuration.
 */
public enum Metrics {

    /**
     * Lack of Cohesion in Methods metric.
     */
    LCOM(true, null, null),

    /**
     * Cohesion Among Methods of Classes metric. A class cohesion metric for object-oriented designs
     */
    CAMC(true, null, null),

    /**
     * Method-Method through Attributes Cohesion metric. A Design-Based Cohesion Metric for
     * Object-Oriented Classes
     */
    MMAC(true, 0.5d, 0.1d),

    /**
     * Lack of Cohesion in Methods metric. Coupling and cohesion
     * (towards a valid metrics suite for object-oriented analysis and design)
     */
    LCOM5(true, 0.5d, -0.1d),

    /**
     * Lack of Cohesion in Methods 4  metric. Measuring Coupling and Cohesion In
     * Object-Oriented Systems
     */
    LCOM4(true, 0.5d, -0.1d),

    /**
     * Normalized Hamming Distance metric.
     * The interpretation and utility of three cohesion metrics for object-oriented design
     */
    NHD(false, null, null),

    /**
     * Lack of Cohesion in Methods metric. Coupling and cohesion
     * (towards a valid metrics suite for object-oriented analysis and design)
     */
    LCOM2(true, null, null),

    /**
     * Lack of Cohesion in Methods metric. Coupling and cohesion
     * (towards a valid metrics suite for object-oriented analysis and design)
     */
    LCOM3(true, null, null),

    /**
     * A Sensitive Metric of Class Cohesion metric.
     * [A] new metric [...] yielding meaningful values [...] more sensitive than those previously
     * reported,
     */
    SCOM(true, null, null),

    /**
     * Optimistic Class Cohesion metric. A proposal of class cohesion metrics using sizes of
     * cohesive parts
     */
    OCC(true, null, null),

    /**
     * Pessimistic Class Cohesion metric. A proposal of class cohesion metrics using sizes of
     * cohesive parts
     */
    PCC(false, null, null),

    /**
     * Tight Class Cohesion metric. Cohesion and Reuse in an Object-Oriented System
     */
    TCC(false, null, null),

    /**
     * Loose Class Cohesion metric. Cohesion and Reuse in an Object-Oriented System
     */
    LCC(false, null, null),

    /**
     * Class Connection metric. Measuring Class Cohesion in Object-Oriented Systems
     */
    CCM(false, null, null),

    /**
     * Maximal Weighted Entropy metric. Modeling class cohesion as mixtures of latent topics
     */
    MWE(false, null, null);

    /**
     * Indicates whether parameters should be included for this metric.
     */
    private final boolean parameters;
    /**
     * Mean value for the metric, if applicable.
     */
    private final Double mean;
    /**
     * Standard deviation for the metric, if applicable.
     */
    private final Double sigma;

    /**
     * Constructor for Metrics enum.

     * @param args Indicates whether parameters should be included for this metric
     * @param avg Mean value for the metric, if applicable
     * @param deviation Standard deviation for the metric, if applicable
     */
    Metrics(final boolean args, final Double avg, final Double deviation) {
        this.parameters = args;
        this.mean = avg;
        this.sigma = deviation;
    }

    /**
     * Gets whether parameters should be included for this metric.

     * @return True if parameters should be included, false otherwise
     */
    public boolean isIncludeParams() {
        return this.parameters;
    }

    /**
     * Gets the mean value for the metric.

     * @return The mean value, or null if not applicable
     */
    public Double getMean() {
        return this.mean;
    }

    /**
     * Gets the standard deviation for the metric.

     * @return The standard deviation, or null if not applicable
     */
    public Double getSigma() {
        return this.sigma;
    }
}
