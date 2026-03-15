package dev.rafex.ether.websocket.core;

/*-
 * #%L
 * ether-websocket-core
 * %%
 * Copyright (C) 2025 - 2026 Raúl Eduardo González Argote
 * %%
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * #L%
 */

public record WebSocketCloseStatus(int code, String reason) {

	public static final WebSocketCloseStatus NORMAL = new WebSocketCloseStatus(1000, "normal");
	public static final WebSocketCloseStatus GOING_AWAY = new WebSocketCloseStatus(1001, "going_away");
	public static final WebSocketCloseStatus PROTOCOL_ERROR = new WebSocketCloseStatus(1002, "protocol_error");
	public static final WebSocketCloseStatus NOT_ACCEPTABLE = new WebSocketCloseStatus(1003, "not_acceptable");
	public static final WebSocketCloseStatus SERVER_ERROR = new WebSocketCloseStatus(1011, "server_error");

	public WebSocketCloseStatus {
		reason = reason == null ? "" : reason;
	}

	public static WebSocketCloseStatus of(final int code, final String reason) {
		return new WebSocketCloseStatus(code, reason);
	}
}
