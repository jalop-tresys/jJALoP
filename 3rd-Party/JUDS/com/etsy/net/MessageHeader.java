/**
 * Class to replicate C msghdr struct.
 * <p>
 * Source code in 3rd-party is licensed and owned by their respective
 * copyright holders.
 * <p>
 * All other source code is copyright Tresys Technology and licensed as below.
 * <p>
 * Copyright (c) 2012 Tresys Technology LLC, Columbia, Maryland, USA
 * <p>
 * This software was developed by Tresys Technology LLC
 * with U.S. Government sponsorship.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 *    http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.etsy.net;

public class MessageHeader {

	Object[] iov;
	String filePath;

	/**
	 * Constructor
	 */
	public MessageHeader() {

	}

	/**
	 * @return the iov
	 */
	public Object[] getIov() {
		return iov;
	}

	/**
	 * @param iov the iov to set
	 */
	public void setIov(Object[] iov) {
		this.iov = iov;
	}

	/**
	 * @return the filePath String
	 */
	public String getFilePath() {
		return filePath;
	}

	/**
	 * @param filePath	the String to set
	 */
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

}