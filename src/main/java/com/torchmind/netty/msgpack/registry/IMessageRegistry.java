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
package com.torchmind.netty.msgpack.registry;

import com.torchmind.netty.msgpack.error.MessageRegistryException;

/**
 * Declares required methods for message registries.
 * @author Johannes Donath <johannesd@evil-co.com>
 * @copyright Copyright (C) 2014 Evil-Co <http://www.evil-co.com>
 */
public interface IMessageRegistry {

	/**
	 * Searches a message identifier based on a type.
	 * @param messageType The message type.
	 * @return The identifier.
	 * @throws com.torchmind.netty.msgpack.error.MessageRegistryException Occurs when a message type could not be localized.
	 */
	public short getMessageID (Class<?> messageType) throws MessageRegistryException;

	/**
	 * Searches a message type based on an identifier.
	 * @param messageID The message identifier.
	 * @return The message type.
	 * @throws com.torchmind.netty.msgpack.error.MessageRegistryException Occurs when a message type could not be localized.
	 */
	public Class<?> getMessageType (short messageID) throws MessageRegistryException;
}
