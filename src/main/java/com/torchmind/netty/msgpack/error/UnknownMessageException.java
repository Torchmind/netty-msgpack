/*
 * Copyright 2014 Johannes Donath <johannesd@torchmind.com>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.torchmind.netty.msgpack.error;

/**
 * Occurs when a message registration is not found in a registry.
 * @author Johannes Donath <johannesd@evil-co.com>
 * @copyright Copyright (C) 2014 Evil-Co <http://www.evil-co.com>
 */
public class UnknownMessageException extends MessageRegistryException {

	/**
	 * Constructs a new UnknownMessageException instance.
	 */
	public UnknownMessageException () {
		super ();
	}

	/**
	 * Constructs a new UnknownMessageException instance.
	 * @param message The error message.
	 */
	public UnknownMessageException (String message) {
		super (message);
	}

	/**
	 * Constructs a new UnknownMessageException instance.
	 * @param message The error message.
	 * @param cause The error cause.
	 */
	public UnknownMessageException (String message, Throwable cause) {
		super (message, cause);
	}

	/**
	 * Constructs a new UnknownMessageException instance.
	 * @param cause The error cause.
	 */
	public UnknownMessageException (Throwable cause) {
		super (cause);
	}
}
