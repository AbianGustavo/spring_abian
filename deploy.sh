#!/bin/bash

ssh abian@74.234.38.215 "
  cd $(dirname $0)
  rm -r travelroad_spring
  git clone git@github.com:AbianGustavo/spring_abian.git
  mv spring_abian travelroad_spring
  cd /home/abian/travelroad_spring
  systemctl --user restart travelroad.service
"
