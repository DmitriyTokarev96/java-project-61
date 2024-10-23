.DEFAULT_GOAL := build-run

setup:
	run app make setup

clean:
	run app make clean

build:
	run app make build

install:
	run app make install

run-dist:
	run app make run-dist

run:
	run app make run

test:
	run app make test

report:
	run app make report

lint:
	run app make lint

check-deps:
	run app make check-deps

build-run: build run

.PHONY: setup clean build install run-dist run test report lint check-deps build-run
