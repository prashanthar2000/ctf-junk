import socket

IP = '88.198.219.20'
PORT = 23125

s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
s.connect((IP, PORT))
s.setblocking(0)


buffer = b''

while True:
    # Read until a prompt or line break
    try:
        chunk = s.recv(4096)
        buffer += chunk
        print(chunk.decode(), end='')
    except BlockingIOError:
        pass

    if b'\n' not in buffer and not buffer.endswith(b': '):
        continue

    # Grab the oldest line
    buffer = buffer.split(b'\n', 1)
    if len(buffer) == 1:
        line, buffer = buffer[0], b''
    else:
        line, buffer = buffer

    # Llines start with [<code>]
    if line[:1] != b'[':
        continue

    # Use slicing not indexing because indexing bytes returns ints
    mode = line[1:2]
    if mode == b'*':
        ...
    elif mode == b'c':
        ...
    elif mode == b':':
        ...
    elif mode == b'!':
        ...
    elif mode == b'?':
        ...
    else:
        ...
