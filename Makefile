.DEFAULT_GOAL := build-run

setup:
	docker-compose run app make setup

clean:
	docker-compose run app make clean

build:
	docker-compose run app make build

install:
	docker-compose run app make install

run-dist:
	docker-compose run app make run-dist

run:
	docker-compose run app make run

test:
	docker-compose run app make test

report:
	docker-compose run app make report

lint:
	docker-compose run app make lint

check-deps:
	docker-compose run app make check-deps

build-run: build run

.PHONY: setup clean build install run-dist run test report lint check-deps build-run