#!/bin/bash

usage() {
    info "Usage:"
    info "    start.sh [-b] [-s]"
    info "Options:"
    info "    -b    <background>    Run containers in background"
    info "    -s    <skipBuild>     Skip application building step"
    info "Examples:"
    info "    start.sh"
    info "    start.sh -b"
    info "    start.sh -s"
    info "    start.sh -b -s"
}

info() {
    printf "[start.sh] $1\n"
}

error() {
    info "[ERROR] $1"
    info ""
    usage
    exit 1
}

function start_components() {
    docker-compose down
    docker-compose up --build ${backgroundFlag}

    trap 'docker-compose down' EXIT
}

function start_components_background() {
    docker-compose down
    docker-compose up --build ${backgroundFlag}

    info "Waiting for the application to respond..."

    until $(curl --output /dev/null --silent --fail http://localhost:8080/playground); do
        printf '.'
        sleep 2
    done

    printf "\n"
    info "All set! Don't forget to manually shut the environment down with 'docker-compose down'."
}

#get flags from command line
background=false
backgroundFlag=""
skipBuild=false
while getopts :bs option
do
    case "${option}" in
        b)
            background=true
            backgroundFlag="-d";;
        s)
            skipBuild=true;;
        \?)
            error "Invalid argument: -$OPTARG";;
    esac
done

info "Starting components with:"
info "<background>: $background"
info "<skipBuild>: $skipBuild"

if [[ ${skipBuild} == false ]] ;
    then
        ./gradlew clean build
fi

if [[ ${background} == true ]] ;
    then
        start_components_background
else
    start_components
fi