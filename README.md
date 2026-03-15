# ether-websocket-core

Transport-agnostic WebSocket contracts and reusable routing primitives for Ether.

## Scope

- WebSocket endpoint contract
- Session contract
- Route and route matching
- Close status abstraction
- Portable lifecycle callbacks (`onOpen`, `onText`, `onBinary`, `onClose`, `onError`)

This module intentionally excludes transport-specific details such as Jetty APIs,
HTTP upgrade handling and server wiring.
