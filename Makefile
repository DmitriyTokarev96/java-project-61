setup:
	cd app/app && make setup

build:
	cd app/app && make build

run-dist:
	cd app/app && make run-dist

run:
	cd app/app && make run

test:
	cd app/app && make test

check:
	cd app/app && make check

install:
	cd app/app && make install

clean:
	cd app/app && make clean

.PHONY: setup build run-dist run test check install clean
