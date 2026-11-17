#!/usr/bin/env bash

str="$1"
reverse=""
len=${#str}
for ((i=len-1; i>=0; i--)); do
    reverse+="${str:$i:1}"
done
echo "$reverse"