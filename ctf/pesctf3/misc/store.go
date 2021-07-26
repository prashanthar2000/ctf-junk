package main

import (
	"fmt"
	"os"
)

func main() {
	var balance int64 = 1000
	for {
		var choice int64
		fmt.Println("Welcome to the all-american store!")
		fmt.Println("What would you like to do?")
		fmt.Printf("1. Show me my balance! \n2. Show me your products! \n3. I don't like this place, I want out.\n\n")
		fmt.Scanln(&choice)

		if choice == 1 {
			fmt.Println("Your balance is", balance, "\n")
		} else if choice == 2 {
			var product int64
			fmt.Println("Here's our products: \n1. Secret to ethical hacking ($100) \n2. Solutions for this CTF (FREE) \n3. The lame flag for this challenege. ($1 million)")
			fmt.Println("\nWould you like to buy any?\n\n")
			fmt.Scanln(&product)

			if product == 1 {
				var quantity int64
				fmt.Println("How many passes do you want?\n\n")
				fmt.Scanln(&quantity)
				if quantity < 0 {
					fmt.Println("Who are you trying to cheat?! GET OUT!")
					os.Exit(1)
				} else {
					var cost int64 = (quantity * 100)
					if cost <= balance {
						balance = balance - cost
						fmt.Println("Here you go. This is all you need to master ethical hacking!\n https://bit.ly/2ACBEIF\n\n")
					} else {
						fmt.Println("You're poor! Get outta here!")
						os.Exit(1)
					}
				}
			} else if product == 2 {
				fmt.Println("Here are your solutions. Don't tell the others!\nhttps://bit.ly/3gUtN9X\n\n")
			} else if product == 3 {
				if balance-1000000 > 0 {
					balance = balance - 1000000
					fmt.Println("Heres's your flag! CTF{I'M AMERICAN, NOT STUPID!}\n\n")
				} else {
					fmt.Println("You're poor! Get outta here!")
					os.Exit(1)
				}
			} else {
				fmt.Println("What sort of retarded option was that? Start over!\n\n")
			}
		} else if choice == 3 {
			fmt.Println("Good Bye!")
			os.Exit(0)
		} else {
			fmt.Println("What sort of retarded option was that? Try again!\n\n")
		}

	}
}
