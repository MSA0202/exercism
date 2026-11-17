#!/usr/bin/env bash

# or backwards
reversed=''
for ((i = ${#string} - 1; i >= 0; i--)); do
    reversed+="${string:i:1}"
done

str="$1"
reverse=""
len=${#str}
for ((i=len-1; i>=0; i--)); do
    reverse+="${str:$i:1}"
done
echo "$reverse"