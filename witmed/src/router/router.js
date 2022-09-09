import router from "index";

router.beforeEach((to, from) => {
  console.log(to);
  console.log(from)
  return false
})
