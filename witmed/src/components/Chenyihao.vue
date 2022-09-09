<template>
  <div id="app">
    <h1>大家好，我叫陈义豪！</h1>
    <router-link to="/chenyihao/anhong/陈义豪/13468523450">查看安红</router-link>
    <router-link to="/chenyihao/cuifen">查看翠芬</router-link>
    <button type="button" @click="lookWangyi">想不想看看王姨</button>
    <button type="button" @click="testGo">看看历史记录</button>
    <router-view></router-view>
  </div>
</template>

<script>
export default {
  name: "Chenyihao",
  methods: {
    lookWangyi: function() {
      // 使用动态路由进行跳转
      // 在不使用 <router-link> 标签的情况下，通过 JS 实现了路由的跳转功能
      this.$router.push({
        path: "/chenyihao/wangyi",
      });
    },
    testGo: function() {
      this.$router.go(-1);
    }
  }
}
</script>

<style scoped>

</style>
