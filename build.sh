#!/bin/bash
#export VERSION="0.0.1"
#mvn clean
#mvn versions:set -DnewVersion=${VERSION}
mvn clean package deploy -DskipTests