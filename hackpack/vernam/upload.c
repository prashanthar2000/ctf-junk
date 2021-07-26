enum { START, NL, DOT, DONE };

int
main(int argc, char **argv)
{
	int fd, rc, wc, oc, state;
	char c, *ob;

	if (argc != 2) {
		printf("usage: c4 upload.c TARGET_FILENAME\n");
		return -1;
	}

	if ((fd = syscall(2, argv[1], 0x80 | 0x40 | 0x01, 0x1b4)) < 0) {
		printf("fatal: couldn't open '%s' for writing\n", argv[1]);
		return -1;
	}

	state = START;	
	while (state != DONE) {
		rc = read(0, &c, 1);
		ob = &c;
		oc = 1;
		if (rc == 1) {
			if (state == START && c == '\n') {
				state = NL;
			} else if (state == NL) {
				if (c == '.') {
					state = DOT;
					oc = 0;
				} else {
					state = START;
				}
			} else if (state == DOT) {
				if (c == '\n') {
					state = DONE;
					oc = 0;
				} else {
					ob = ".\n";
					oc = 2;
					state = START;
				}
			}
			if (oc > 0) {
				wc = syscall(1, fd, ob, oc);
				if (wc < oc) {
					printf("fatal: short write/write error\n");
					return -1;
				}
			}
		} else {
			printf("fatal: short read/read error\n");
			return -1;
		}
	}
	close(fd);
	return 0;
}
