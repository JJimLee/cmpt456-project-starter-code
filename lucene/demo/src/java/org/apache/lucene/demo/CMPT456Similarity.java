/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Demo applications for indexing and searching.
 */
/*
	ant -f lucene/demo/build.xml \-Ddocs=lucene/demo/data/wiki-small/en/articles/ run-indexing-demo
*/
package org.apache.lucene.demo;

import org.apache.lucene.search.similarities.ClassicSimilarity;

import java.lang.Math;


public class CMPT456Similarity extends ClassicSimilarity {
    @Override
    public float tf(float freq) {
    	float num = 1 + freq;
        return (float) (Math.sqrt(num));
    }

    @Override
    public float idf(long docFreq, long docCount) {
        return 1 + (float) (Math.log((docCount + 2) / (docFreq + 2)) );
    }
}
