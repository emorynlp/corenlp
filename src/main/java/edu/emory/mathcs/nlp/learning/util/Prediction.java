/**
 * Copyright 2015, Emory University
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package edu.emory.mathcs.nlp.learning.util;

import java.io.Serializable;

import edu.emory.mathcs.nlp.common.util.MathUtils;


/**
 * @author Jinho D. Choi ({@code jinho.choi@emory.edu})
 */
public abstract class Prediction implements Serializable, Comparable<Prediction>
{
	private static final long serialVersionUID = 4629812694101207696L;
	protected float score;
	
	public Prediction(float score)
	{
		setScore(score);
	}
	
	public float getScore()
	{
		return score;
	}

	public void setScore(float score)
	{
		this.score = score;
	}
	
	@Override
	public int compareTo(Prediction o)
	{
		return MathUtils.signum(score - o.score);
	}
}