#!/usr/bin/python
import sys, os, subprocess,fnmatch, shutil, csv,re, datetime



def patches_overview(dir):
    origin=""
    with open('flaky.csv') as file:
            lines = file.readlines()
            for line in lines:
                    if ".patch" in line:
                            newline=line.replace('\n','')
                            origin=origin+newline
                    else:
                            origin=origin+line
    with open('newfile.txt','w') as wfile:
             wfile.write(origin)





if __name__ == '__main__':
        patches_overview("")


