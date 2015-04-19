#!/usr/bin/env bash

gradle clean jar

cp -f build/libs/feature-toggle.jar example/web/WEB-INF/lib/
