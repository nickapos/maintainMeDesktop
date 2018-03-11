#!/bin/bash
INSTALLDIR="/home/nickapos/Documents/mybill"
CLASSPATH="$INSTALLDIR/lib"
cd $INSTALLDIR
java -cp $CLASSPATH -jar myBill.jar&
