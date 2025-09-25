def validate_base_price(price):
    if price <= 0:
        print("Gabim: çmimi bazë duhet të jetë > 0.")
        exit(1)

def validate_student_input(input_val):
    if isinstance(input_val, bool):
        return input_val
    else:
        print("Paralajmërim: Vlera e nxënësit nuk është boolean. Supozohet false.")
        return False

def main():
    # Example inputs
    base_price = float(input("Jepni çmimin bazë: "))
    student_input_raw = input("Jepni vlerën e nxënësit (true/false): ").strip().lower()

    validate_base_price(base_price)

    # Convert student input string to boolean if valid
    if student_input_raw == 'true':
        student = True
    elif student_input_raw == 'false':
        student = False
    else:
        student = validate_student_input(student_input_raw)

    print(f"Çmimi bazë: {base_price}")
    print(f"Vlera e nxënësit: {student}")

if __name__ == "__main__":
    main()
