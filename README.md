# 🎬 Java OOP: Polymorphism with Netflix Flavor

This repo brings Java OOP concepts to life — Netflix style.  
We focus on **Polymorphism** and its two powerful forms:

- ✅ **Method Overloading** — Same method name, different signatures (Compile-time)
- 🔁 **Method Overriding** — Same method name, different behavior (Runtime)

Let’s binge some clean code 🍿

---

## ✅ Method Overloading: One Name, Many Roles

The `NetflixSearch` class shows how the same method name `search()` can serve different purposes based on parameters.

search("Dark");
search("Dark", "Sci-Fi");
search("Dark", "Sci-Fi", 2017);

---

## ✅ Method Overriding: Same Method, New Personality
The NetflixPlayer base class defines a play() method.

Its subclasses (MobilePlayer, SmartTVPlayer) override it to deliver a customized streaming experience based on the device:

NetflixPlayer player = new MobilePlayer();
player.play("Dark");  // Plays in Mobile style

player = new SmartTVPlayer();
player.play("Breaking Bad");  // Plays in TV style

---

By Ragavi Venkatesh


