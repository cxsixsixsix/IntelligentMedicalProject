<template>
  <div id="app">
    <h1>我是陈义豪最爱的那个姨，我的名字叫安红！</h1>
    <h1>{{message}} - {{cellphone}}</h1>
  </div>
</template>

<script>
export default {
  name: "Anhong",
  data: function() {
    return {
      // 当通过路由传递参数时，该参数会打包到 this.$route 的 JSON 中，
      // 以 params 对应的 JSON 存在
      message: this.$route.params.name,
      cellphone: this.$route.params.cellphone
    }
  }
}
</script>

<style scoped>

</style>
