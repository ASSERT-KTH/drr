#!/usr/bin/python

import os

if __name__ == '__main__':
    for i in range(1,134):
        os.system('tar -jcvf Closure-'+str(i)+'f-randoop.1.tar.bz2  Closure-'+str(i)+'f-randoop.1' )
