/*
 *      FooBarBaz.java
 *      
 *      Copyright 2010 Manuel Aguirre <manuel.aguirre@phsistemas.net>
 *      
 *      This program is free software; you can redistribute it and/or modify
 *      it under the terms of the GNU General Public License as published by
 *      the Free Software Foundation; either version 2 of the License, or
 *      (at your option) any later version.
 *      
 *      This program is distributed in the hope that it will be useful,
 *      but WITHOUT ANY WARRANTY; without even the implied warranty of
 *      MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *      GNU General Public License for more details.
 *      
 *      You should have received a copy of the GNU General Public License
 *      along with this program; if not, write to the Free Software
 *      Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 *      MA 02110-1301, USA.
 */


public class FooBarBaz {
	
	public static void main (String args[]) {
		for(int number=1; number<=50; number++)
		{
			System.out.print(number + " ");
			if((number%3)==0)
			System.out.print("foo ");
			if((number%5)==0)
			System.out.print("bar ");
			if((number%7)==0)
			System.out.print("baz ");
			System.out.println();
		}
	}
}

