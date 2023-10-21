import java.util.ArrayList;
import java.util.Scanner;

class Menu {
    private String name;
    private String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}

class Product extends Menu {
    private double price;

    public Product(String name, String description, double price) {
        super(name, description);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

class Order {
    private ArrayList<Product> cart = new ArrayList<>();
    private double total = 0;

    public void addToCart(Product product) {
        cart.add(product);
        total += product.getPrice();
    }

    public void displayCart() {
        System.out.println("[ Orders ]");
        for (Product product : cart) {
            System.out.println(product.getName() + " | " + product.getDescription() + " | $" + product.getPrice());
        }
        System.out.println("\n[ Total ]");
        System.out.println("W " + total);
    }

    public void clearCart() {
        cart.clear();
        total = 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Order order = new Order();

        // 메뉴 항목 및 상품 정보 추가
        ArrayList<Menu> menuItems = new ArrayList<>();
        menuItems.add(new Menu("Burgers", "앵거스 비프 통살을 다져만든 버거"));
        menuItems.add(new Menu("Forzen Custard", "매장에서 신선하게 만드는 아이스크림"));
        menuItems.add(new Menu("Drinks", "매장에서 직접 만드는 음료"));

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("ShackBurger", "토마토, 양상추, 쉑소스가 토핑된 치즈버거", 6.9));
        products.add(new Product("SmokeShack", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거", 8.9));
        // 나머지 상품 정보 추가


        while (true) {
            System.out.println("버거킹에 오신걸 환영합니다.");
            System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
            System.out.println();
            System.out.println("[ BurgerKing MENU ]");
            System.out.println("1. Burgers         | 앵거스 비프 통살을 다져만든 버거");
            System.out.println("2. Forzen Custard  | 매장에서 신선하게 만드는 아이스크림");
            System.out.println("3. Drinks          | 매장에서 직접 만드는 음료");
            System.out.println("4. Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주");
            System.out.println();
            System.out.println("[ ORDER MENU ]");
            System.out.println("5. Order       | 장바구니를 확인 후 주문합니다.");
            System.out.println("6. Cancel      | 진행중인 주문을 취소합니다.");

            int choice = scanner.nextInt();
            scanner.nextInt();

            if (choice == 5) {
                order.displayCart();
                System.out.println("1. 주문      2. 메뉴판");
                int orderChoice = scanner.nextInt();
                if (orderChoice == 1) {
                    System.out.println("주문이 완료되었습니다!");
                    System.out.println("대기번호는 [ 1 ]번 입니다.");
                    System.out.println("(3초 후 메뉴판으로 돌라갑니다.)");
                    order.clearCart();
                }
            } else if (choice == 6) {
                System.out.println("진행하던 주문을 취소하시겠습니까?");
                System.out.println("1. 확인        2. 취소");
                int cancelChoice = scanner.nextInt();
                if (cancelChoice == 1) {
                    System.out.println("진행하던 주문이 취소되었습니다.");
                    order.clearCart();
                }
            }
        }
    }
}























